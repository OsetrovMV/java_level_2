package ru.geekbrains.javacore.qa.homeWork1.team;

import ru.geekbrains.javacore.qa.homeWork1.Status;

public class TeamMember {
    private Status status = Status.NoPassedDistance;
    private String nameTeamMember;
    private int power;

    public TeamMember(String nameTeamMember, int power) {
        this.nameTeamMember = nameTeamMember;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getNameTeamMember() {
        return nameTeamMember;
    }

    public void jump(int courseDifficulty){
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Преодолел барьер");
        }
        else{
            changeStatus(Status.NoPassedDistance," Не преодолел барьер");
        }
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Пробежал кросс");
        }
        else{
            changeStatus(Status.NoPassedDistance," Не пробежал кросс");
        }
    }

    public void swimm(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance," Проплыл дистанцию");
        }
        else{
            changeStatus(Status.NoPassedDistance," Не проплыл дистанцию");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(nameTeamMember + message);
    }
}
