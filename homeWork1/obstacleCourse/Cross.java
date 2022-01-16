package ru.geekbrains.javacore.qa.homeWork1.obstacleCourse;

import ru.geekbrains.javacore.qa.homeWork1.team.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }
    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
