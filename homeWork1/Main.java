package ru.geekbrains.javacore.qa.homeWork1;

import ru.geekbrains.javacore.qa.homeWork1.obstacleCourse.Course;
import ru.geekbrains.javacore.qa.homeWork1.obstacleCourse.Cross;
import ru.geekbrains.javacore.qa.homeWork1.obstacleCourse.Swimming;
import ru.geekbrains.javacore.qa.homeWork1.obstacleCourse.Jumping;
import ru.geekbrains.javacore.qa.homeWork1.team.Team;
import ru.geekbrains.javacore.qa.homeWork1.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("First", 6),
                new TeamMember("Second", 5),
                new TeamMember("Third", 7));

        Course course = new Course(new Cross(7), new Swimming(5), new Jumping(8) );
        course.doIt(dreamTeam);

    }
}
