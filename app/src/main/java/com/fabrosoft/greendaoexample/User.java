package com.fabrosoft.greendaoexample;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by franklin on 30/07/2018 AD.
 */

@Entity(nameInDb = "user")
public class User {

        @Id(autoincrement = true)
        private Long id;

        @Property(nameInDb = "name")
        private String name;

         @Property(nameInDb = "create_at")
        private String createdAt;

    @Property(nameInDb = "update_at")
    private String updatedAt;

        @Generated(hash = 1543916479)
        public User(Long id, String name, String createdAt, String updatedAt) {
            this.id = id;
            this.name = name;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
        }

        @Generated(hash = 586692638)
        public User() {
        }

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreatedAt() {
            return this.createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }
}
