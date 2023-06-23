package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int a = 0;
        double b = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                b += subject.score();
                a++;
            }
        }
        return b / a;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> students = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sum = 0;
            int counter = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                counter++;
            }
            students.add(new Label(pupil.name(), sum / (double) counter));
        }
        return students;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subj : subjects) {
                map.merge(subj.name(), subj.score(), (oldValue, newValue) -> oldValue + subj.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            labels.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> bestStudent = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scores = 0;
            for (Subject subject : pupil.subjects()) {
                scores += subject.score();
                bestStudent.add(new Label(pupil.name(), scores));
                bestStudent.sort(Comparator.naturalOrder());
            }
        }
        return bestStudent.get(bestStudent.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> card = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            List<Subject> subjects = pupil.subjects();
            for (Subject subj : subjects) {
                card.merge(subj.name(), subj.score(), (oldValue, newValue) -> oldValue + subj.score());
            }
        }
        List<Label> cards = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : card.entrySet()) {
            cards.add(new Label(entry.getKey(), entry.getValue()));
        }
        cards.sort(Comparator.naturalOrder());
        return cards.get(cards.size() - 1);
    }
}
