package a.syrov.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Hero {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @Override
//    public String toString() {
//        return "Hero{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
}
