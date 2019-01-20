package com.kj.particle.impl.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "posts")
public class Post {
    private UUID uuid;
    private String name;
    private String text;
    private UUID userUuid;

    protected Post() {}

    public Post(UUID uuid, String name, String text, UUID userUuid) {
        this.uuid = uuid;
        this.name = name;
        this.text = text;
        this.userUuid = userUuid;
    }

    @Id
    @GeneratedValue
    @Column(name = "uuid")
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "user_uuid", nullable = true)
    public UUID getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(UUID userUuid) {
        this.userUuid = userUuid;
    }
}
