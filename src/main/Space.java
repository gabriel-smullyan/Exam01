package main;

public class Space {
    public String name;
    public String description;
    public String address;
    public String zip;
    public double rating;
    public int num_reviews;
    public String type;
    public boolean is_verified;
    private User creator;

    public Space(String name, String description, String address, String zip, double rating, int num_reviews, String type, boolean is_verified, User creator) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.zip = zip;
        this.rating = rating;
        this.num_reviews = num_reviews;
        this.type = type;
        this.is_verified = is_verified;
        this.creator = creator;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setNumReviews(int num_reviews) {
        this.num_reviews = num_reviews;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsVerified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAddress() {
        return this.address;
    }

    public String getZip() {
        return this.zip;
    }

    public double getRating() {
        return this.rating;
    }

    public int getNumReviews() {
        return this.num_reviews;
    }

    public String getType() {
        return this.type;
    }

    public boolean getIsVerified() {
        return this.is_verified;
    }

    public User getCreator() {
        return this.creator;
    }

    public String toString() {
        return "Name: " + this.name + "\nDescription: " + this.description + "\nAddress: " + this.address + "\nZip: " + this.zip + "\nRating: " + this.rating + "\nNumber of Reviews: " + this.num_reviews + "\nType: " + this.type + "\nIs Verified: " + this.is_verified;
    }
    
}
