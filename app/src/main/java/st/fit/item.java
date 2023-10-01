package st.fit;

public class item {
    private int image;
    private String titulo1;

    public item(int image, String titulo1) {
        this.image = image;
        this.titulo1 = titulo1;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public String getTitulo1() {
        return titulo1;
    }
    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }
}