package ch.heigvd.gen2019.sizes;

public class Size {

    @Override
    public String toString() {
        return "Invalid Size";
    }
    public static Size CreateFromInt(int i) {

        switch (i) {
            case 1:
                return new SizeXS();
            case 2:
                return new SizeS();
            case 3:
                return new SizeM();
            case 4:
                return new SizeL();
            case 5:
                return new SizeXL();
            case 6:
                return new SizeXXL();
            default:
                return new Size();
        }
    }
}

class SizeXS extends Size{

    @Override
    public String toString() {
        return "XS";
    }
}

class SizeS extends Size{

    @Override
    public String toString() {
        return "S";
    }
}

class SizeM extends Size{

    @Override
    public String toString() {
        return "M";
    }
}

class SizeL extends Size{

    @Override
    public String toString() {
        return "L";
    }
}

class SizeXL extends Size{

    @Override
    public String toString() {
        return "XL";
    }
}
class SizeXXL extends Size{

    @Override
    public String toString() {
        return "XXL";
    }
}


