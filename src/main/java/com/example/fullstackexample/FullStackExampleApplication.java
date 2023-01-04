package com.example.fullstackexample;

import com.example.fullstackexample.enumeration.Status;
import com.example.fullstackexample.model.Server;
import com.example.fullstackexample.repo.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullStackExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullStackExampleApplication.class, args);
    }

    CommandLineRunner run(ServerRepository serverRepository){
        return args -> {
            serverRepository.save(new Server(null, "192.168.1.1", "Ubuntu", "16GB", "Notebook", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
            serverRepository.save(new Server(null, "192.168.1.1", "Ubuntu", "24GB", "PC", "http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
            serverRepository.save(new Server(null, "192.168.1.1", "Ubuntu", "32GB", "Notebook", "http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
            serverRepository.save(new Server(null, "192.168.1.1", "Ubuntu", "24GB", "Notebook", "http://localhost:8080/server/image/server4.png", Status.SERVER_UP));

        };
    }
}
