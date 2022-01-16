package ru.geekbrains.javacore.qa.homeWork1.obstacleCourse;

import ru.geekbrains.javacore.qa.homeWork1.team.TeamMember;

public class Jumping extends Obstacle {

    public Jumping(int difficulty) {
        super(difficulty);
    }
    @Override
    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
