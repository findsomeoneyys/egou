package com.ys.egou;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EgouApplicationTests {

    @AfterAll
    public static void finish() throws Exception {
        File file = new ClassPathResource("pika.txt").getFile();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    @Test
    public void contextLoads() {
    }

}
