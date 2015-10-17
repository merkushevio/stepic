package test.week2;


import test.test;

import java.util.Objects;

public final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Objects.equals(re, that.re) &&
                Objects.equals(im, that.im);
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}


