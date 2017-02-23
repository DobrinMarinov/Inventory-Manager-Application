package app.models;

import app.models.enums.Size;
import app.models.enums.Type;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dress")
public class Dress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    private String name;

    @Basic
    private Type type;

    @Basic
    private int quantity;

    @Basic
    private Size size;

    @Column(name = "single_price")
    private BigDecimal singlePrice;

    @Column(name = "dress_picture", columnDefinition = "LONGBLOB")
    private byte[] dressPicture;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public Dress() {
    }

    public Dress(String name, Type type, int quantity, Size size, BigDecimal singlePrice, byte[] dressPicture, String description) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.size = size;
        this.singlePrice = singlePrice;
        this.dressPicture = dressPicture;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public BigDecimal getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(BigDecimal singlePrice) {
        this.singlePrice = singlePrice;
    }

    public byte[] getDressPicture() {
        return dressPicture;
    }

    public void setDressPicture(byte[] dressPicture) {
        this.dressPicture = dressPicture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
