package ru.geekbrains.lesson3;

class Box implements Comparable<Box> {

    private int width;
    private int height;

    Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        return width * height - o.width * o.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;

        Box box = (Box) o;
        return  width == box.width && height == box.height;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }
}
