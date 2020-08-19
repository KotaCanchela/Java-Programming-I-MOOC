public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        // Archive constructor created with name and identifier strings
        this.name = name;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object compared) {
        // Compares if objects are in the same position
        if (this == compared) {
            return true;
        }

        // If object is not of type Archive, they are not equal
        if (!(compared instanceof Archive)) {
            return false;
        }

        // Converts the object into Archive object
        Archive archiveObject = (Archive) compared;

        // Compares name and identifier string of identifier object, returns true if they are equal
        if (this.identifier.equals(archiveObject.identifier)) {
            return true;
        }

        return false;
    }

    @Override public String toString() {
        return this.getIdentifier() +": " + this.getName();
    }
}
