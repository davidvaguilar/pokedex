package com.almaralengineering.pokedex;

public class Pokemon {
    private String id;
    private String name;
    private int imageId;
    private int soundId;
    private Type type;

    public enum Type {
        FIRE, WATER, PLANT, ELECTRIC
    }

    public Pokemon(String id, String name, int imageId, int soundId, Type type) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
        this.soundId = soundId;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getImageId(){ return imageId; }

    public int getSoundId(){ return soundId; }

    public Type getType() {
        return type;
    }
}
