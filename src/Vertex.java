public class Vertex {
    private final String name;
    private final int value;

    public Vertex(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("Vertex{name='%s', value=%d}", name, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vertex vertex = (Vertex) obj;
        return value == vertex.value && name.equals(vertex.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + value;
    }
}
