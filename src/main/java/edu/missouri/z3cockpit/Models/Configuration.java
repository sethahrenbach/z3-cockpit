package edu.missouri.z3cockpit.Models;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class Configuration {
    private String name;
    private Integer rightAirspeed;
    private Integer rightBank;
    private Integer rightPitch;
    private Integer rightAlt;

    private Integer middleAirspeed;
    private Integer middleBank;
    private Integer middlePitch;
    private Integer middleAlt;

    private Integer leftAirspeed;
    private Integer lefttBank;
    private Integer leftPitch;
    private Integer leftAlt;

    private Boolean autoThrottle;

    public Configuration(){

    }

    public Configuration(String name,
                         Integer rightAirspeed, Integer rightPitch, Integer rightBank, Integer rightAlt,
                         Integer middleAirspeed, Integer middlePitch, Integer middleBank, Integer middleAlt,
                         Integer leftAirspeed, Integer leftPitch, Integer leftBank, Integer leftAlt,
                         Boolean autoThrottle) {
        this.rightAirspeed = rightAirspeed;
        this.rightPitch = rightPitch;
        this.rightBank = rightBank;
        this.rightAlt = rightAlt;

        this.middleAirspeed = middleAirspeed;
        this.middleBank = middleBank;
        this.middlePitch = middlePitch;
        this.middleAlt = middleAlt;

        this.leftAirspeed = leftAirspeed;
        this.lefttBank = leftBank;
        this.leftPitch = leftPitch;
        this.leftAlt = leftAlt;

        this.autoThrottle = autoThrottle;
    }

    public File getSMT2(){
        File smt2 = new File(this.getName() + ".smt2");
        String smt2config;
        try {
            FileWriter writer = new FileWriter(smt2);
            writer.write(";; " + this.getName() + "\n" +
                    "(set-option :produce-unsat-cores true)\n\n" +
                    ";; right side instruments");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return smt2;
    }

    public Integer getRightAirspeed() {

        return rightAirspeed;
    }

    public void setRightAirspeed(Integer rightAirspeed) {
        this.rightAirspeed = rightAirspeed;
    }

    public Integer getRightBank() {
        return rightBank;
    }

    public void setRightBank(Integer rightBank) {
        this.rightBank = rightBank;
    }

    public Integer getRightPitch() {
        return rightPitch;
    }

    public void setRightPitch(Integer rightPitch) {
        this.rightPitch = rightPitch;
    }

    public Integer getRightAlt() {
        return rightAlt;
    }

    public void setRightAlt(Integer rightAlt) {
        this.rightAlt = rightAlt;
    }

    public Integer getMiddleAirspeed() {
        return middleAirspeed;
    }

    public void setMiddleAirspeed(Integer middleAirspeed) {
        this.middleAirspeed = middleAirspeed;
    }

    public Integer getMiddleBank() {
        return middleBank;
    }

    public void setMiddleBank(Integer middleBank) {
        this.middleBank = middleBank;
    }

    public Integer getMiddlePitch() {
        return middlePitch;
    }

    public void setMiddlePitch(Integer middlePitch) {
        this.middlePitch = middlePitch;
    }

    public Integer getMiddleAlt() {
        return middleAlt;
    }

    public void setMiddleAlt(Integer middleAlt) {
        this.middleAlt = middleAlt;
    }

    public Integer getLeftAirspeed() {
        return leftAirspeed;
    }

    public void setLeftAirspeed(Integer leftAirspeed) {
        this.leftAirspeed = leftAirspeed;
    }

    public Integer getLefttBank() {
        return lefttBank;
    }

    public void setLefttBank(Integer lefttBank) {
        this.lefttBank = lefttBank;
    }

    public Integer getLeftPitch() {
        return leftPitch;
    }

    public void setLeftPitch(Integer leftPitch) {
        this.leftPitch = leftPitch;
    }

    public Integer getLeftAlt() {
        return leftAlt;
    }

    public void setLeftAlt(Integer leftAlt) {
        this.leftAlt = leftAlt;
    }

    public Boolean getAutoThrottle() {
        return autoThrottle;
    }

    public void setAutoThrottle(Boolean autoThrottle) {
        this.autoThrottle = autoThrottle;
    }

    public String getName() {
        return name;
    }
}
