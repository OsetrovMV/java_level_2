package ru.geekbrains.javacore.qa.homeWork1.obstacleCourse;

import ru.geekbrains.javacore.qa.homeWork1.team.TeamMember;

public class Swimming  extends Obstacle {
    public Swimming(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.swimm(super.getDifficulty());
    }
}
