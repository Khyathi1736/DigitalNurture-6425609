
---

### ✅ 3. `Country.java`

**Path:** `src/main/java/com/example/demo/Country.java`

```java
package com.example.demo;

public class Country {
    private String name;
    private String capital;

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void display() {
        System.out.println("Country Name: " + name);
        System.out.println("Capital: " + capital);
    }
}
