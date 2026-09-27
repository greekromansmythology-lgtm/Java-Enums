package io.github.greekromansmythology;

public enum Buildings {
    DUTHIE("Duthie Center for Engineering", "D128", new Address("222 Eastern Parkway", "Louisville", States.KY, "40208"));

    final private String buildingName;
    final private String buildingCode;
    private final Address address;

    Buildings(String buildingName, String buildingCode, Address address) {
        this.buildingName = buildingName;
        this.buildingCode = buildingCode;
        this.address = address;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public Address getAddress() {
        return address;
    }

}
