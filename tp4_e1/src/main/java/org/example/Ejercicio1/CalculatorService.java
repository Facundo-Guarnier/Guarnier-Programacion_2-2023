package org.example.Ejercicio1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Autowired
    private ConfigurationProperties configurationProperties;

    public int calculatePower(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public int calculatePowerDefault(int base) {
        return (int) Math.pow(base, this.configurationProperties.getDefaultExponent());
    }

    public double calculateRoot(int value, int root) {
        return (double) Math.pow(value, 1.0 / root);
    }

    public double calculateRootDefault(int value) {
        return (double) Math.pow(value, 1.0 / this.configurationProperties.getDefaultRoot());
    }
}
