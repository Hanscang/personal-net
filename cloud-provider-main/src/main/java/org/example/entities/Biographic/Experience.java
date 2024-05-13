package org.example.entities.Biographic;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.entities.Biographic
 * @date 2024/5/13 22:59
 */
public class Experience {
    private int id;
    private int biographicId;
    private String title;
    private String exp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBiographicId() {
        return biographicId;
    }

    public void setBiographicId(int biographicId) {
        this.biographicId = biographicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
