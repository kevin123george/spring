package com.example.Hatake.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
        private final UUID id;
        private final String name;
        private final  String description;
        public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name,@JsonProperty("description") String description){
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public String getName() {
        return name;
        }
        public String getDescription(){
                return description;
        }
        public UUID getId() {
        return id;
        }
}
