package com.se7so.dict;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
@Log4j2
public class PasswordDictReader {
    @Value("${password.file.name}")
    private String passwordFileName;
    @Getter
    private PasswordTrie dict = new PasswordTrie();

    @PostConstruct
    public void readFile() {

        try {
            Files.lines(Paths.get(ClassLoader.getSystemResource(passwordFileName).toURI()), StandardCharsets.ISO_8859_1)
                    .forEach(password -> dict.add(password));

            log.info("Read {} passwords from database", dict.size());
        }
        catch (Exception ex) {
            log.error("An error occurred while loading dictionary of passwords", ex);
        }
    }
}
