package ru.job4j.collection.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double ans = 0;
        int cnt = 0;
        for (Pupil it : pupils) {
            cnt += it.subjects().size();
            for (Subject itscore : it.subjects()) {
                ans += itscore.score();
            }
        }
        return (ans / cnt);
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> ans = new ArrayList<>();
        double avr;
        int cnt = 0;
        for (Pupil itPups : pupils) {
            cnt = itPups.subjects().size();
            avr = 0;
            for (Subject itSubScore : itPups.subjects()) {
                avr += itSubScore.score();
            }
            ans.add(new Label(itPups.name(), avr / cnt));
        }
        return ans;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> tmpResult = new LinkedHashMap<>();
        double avr = 0;
        int cnt = pupils.size();
        for (Pupil it1 : pupils) {
            for (Subject it2 : it1.subjects()) {
                tmpResult.computeIfPresent(it2.name(), (a, b) -> b + it2.score());
               tmpResult.putIfAbsent(it2.name(), it2.score());
            }
        }

        List<Label> ans = new ArrayList<>();
        for (String it : tmpResult.keySet()) {
            ans.add(new Label(it,  tmpResult.get(it) / cnt));
        }
        return ans;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> data = new ArrayList<>();
        double sum;
        for (Pupil it : pupils) {
            sum = 0;
            for (Subject it2 : it.subjects()) {
                sum += it2.score();
            }
            data.add(new Label(it.name(), sum));
        }
        Collections.sort(data);
        return data.get(data.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> tmpResult = new LinkedHashMap<>();
        double avr = 0;
        for (Pupil it1 : pupils) {
            for (Subject it2 : it1.subjects()) {
                tmpResult.computeIfPresent(it2.name(), (a, b) -> b + it2.score());
                tmpResult.putIfAbsent(it2.name(), it2.score());
            }
        }
        List<Label> ans = new ArrayList<>();
        for (String it : tmpResult.keySet()) {
            ans.add(new Label(it,  tmpResult.get(it)));
        }
        Collections.sort(ans);
        return ans.get(ans.size() - 1);
    }
}