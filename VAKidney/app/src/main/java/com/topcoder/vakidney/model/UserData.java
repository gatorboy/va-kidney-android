package com.topcoder.vakidney.model;

import android.content.Context;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Abinash Neupane on 2/9/2018.
 * It contains the overall data for a particular user using the app.
 */

public class UserData extends SugarRecord<UserData> {

    private final static String TAG = "UserData";

    private String username;
    private String password;
    private String fullname;
    private int points;
    private int age;
    private long birthday;
    private int height;
    private int heightFeet;
    private int heightInch;
    private int weight;
    private boolean dialysis;
    private int diseaseCategory;
    private boolean setupgoals;
    private boolean avatar;
    private boolean biometric;
    private double runningcurrent;
    private double runninggoal;
    private int stepcurrent;
    private int stepgoal;
    private int jumpcurrent;
    private int jumpgoal;
    private int swimmingcurrent;
    private int swimminggoal;
    private boolean comorbiditiesHypertension;
    private boolean comorbiditiesDiabetesmellitus;
    private boolean comorbiditiesCongestiveheartfailure;
    private String tag;

    public UserData() {
    }


    public UserData(String username, String password, String fullname, int points, int age, long birthday, int height, int heightFeet, int heightInch, int weight, boolean dialysis, int diseaseCategory, boolean setupgoals, boolean avatar, boolean biometric, double runningcurrent, double runninggoal, int stepcurrent, int stepgoal, int jumpcurrent, int jumpgoal, int swimmingcurrent, int swimminggoal, boolean comorbiditiesHypertension, boolean comorbiditiesDiabetesmellitus, boolean comorbiditiesCongestiveheartfailure, String tag) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.points = points;
        this.age = age;
        this.birthday = birthday;
        this.height = height;
        this.heightFeet = heightFeet;
        this.heightInch = heightInch;
        this.weight = weight;
        this.dialysis = dialysis;
        this.diseaseCategory = diseaseCategory;
        this.setupgoals = setupgoals;
        this.avatar = avatar;
        this.biometric = biometric;
        this.runningcurrent = runningcurrent;
        this.runninggoal = runninggoal;
        this.stepcurrent = stepcurrent;
        this.stepgoal = stepgoal;
        this.jumpcurrent = jumpcurrent;
        this.jumpgoal = jumpgoal;
        this.swimmingcurrent = swimmingcurrent;
        this.swimminggoal = swimminggoal;
        this.comorbiditiesHypertension = comorbiditiesHypertension;
        this.comorbiditiesDiabetesmellitus = comorbiditiesDiabetesmellitus;
        this.comorbiditiesCongestiveheartfailure = comorbiditiesCongestiveheartfailure;
        this.tag = tag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    public int getHeightInch() {
        return heightInch;
    }

    public void setHeightInch(int heightInch) {
        this.heightInch = heightInch;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDialysis() {
        return dialysis;
    }

    public void setDialysis(boolean dialysis) {
        this.dialysis = dialysis;
    }

    public int getDiseaseCategory() {
        return diseaseCategory;
    }

    public void setDiseaseCategory(int diseaseCategory) {
        this.diseaseCategory = diseaseCategory;
    }

    public boolean isSetupgoals() {
        return setupgoals;
    }

    public void setSetupgoals(boolean setupgoals) {
        this.setupgoals = setupgoals;
    }

    public boolean isAvatar() {
        return avatar;
    }

    public void setAvatar(boolean avatar) {
        this.avatar = avatar;
    }

    public boolean isBiometric() {
        return biometric;
    }

    public void setBiometric(boolean biometric) {
        this.biometric = biometric;
    }

    public double getRunningcurrent() {
        return runningcurrent;
    }

    public void setRunningcurrent(double runningcurrent) {
        this.runningcurrent = runningcurrent;
    }

    public double getRunninggoal() {
        return runninggoal;
    }

    public void setRunninggoal(double runninggoal) {
        this.runninggoal = runninggoal;
    }

    public int getStepcurrent() {
        return stepcurrent;
    }

    public void setStepcurrent(int stepcurrent) {
        this.stepcurrent = stepcurrent;
    }

    public int getStepgoal() {
        return stepgoal;
    }

    public void setStepgoal(int stepgoal) {
        this.stepgoal = stepgoal;
    }

    public int getJumpcurrent() {
        return jumpcurrent;
    }

    public void setJumpcurrent(int jumpcurrent) {
        this.jumpcurrent = jumpcurrent;
    }

    public int getJumpgoal() {
        return jumpgoal;
    }

    public void setJumpgoal(int jumpgoal) {
        this.jumpgoal = jumpgoal;
    }

    public int getSwimmingcurrent() {
        return swimmingcurrent;
    }

    public void setSwimmingcurrent(int swimmingcurrent) {
        this.swimmingcurrent = swimmingcurrent;
    }

    public int getSwimminggoal() {
        return swimminggoal;
    }

    public void setSwimminggoal(int swimminggoal) {
        this.swimminggoal = swimminggoal;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public boolean isComorbiditiesHypertension() {
        return comorbiditiesHypertension;
    }

    public void setComorbiditiesHypertension(boolean comorbiditiesHypertension) {
        this.comorbiditiesHypertension = comorbiditiesHypertension;
    }

    public boolean isComorbiditiesDiabetesmellitus() {
        return comorbiditiesDiabetesmellitus;
    }

    public void setComorbiditiesDiabetesmellitus(boolean comorbiditiesDiabetesmellitus) {
        this.comorbiditiesDiabetesmellitus = comorbiditiesDiabetesmellitus;
    }

    public boolean isComorbiditiesCongestiveheartfailure() {
        return comorbiditiesCongestiveheartfailure;
    }

    public void setComorbiditiesCongestiveheartfailure(boolean comorbiditiesCongestiveheartfailure) {
        this.comorbiditiesCongestiveheartfailure = comorbiditiesCongestiveheartfailure;
    }

    @Override
    public void save() {
        super.save();
    }

    /* Mark User Data as logged in */
    public void logIn() {
        this.tag = TAG;
        super.save();
    }

    /* Mark User Data as logged out */
    public void logOut() {
        this.tag = "";
        super.save();
    }

    /* Get Logged in User */
    public static UserData get() {
        List<UserData> userData = UserData.find(UserData.class, "tag = ?", TAG);
        if (userData.size() > 0) return userData.get(0);
        return null;
    }

    /* Get User Data by Email / Username */
    public static UserData get(String email) {
        List<UserData> userData = UserData.find(UserData.class, "username = ?", email);
        if (userData.size() > 0) return userData.get(0);
        return null;
    }

}
