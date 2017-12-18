package sda;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Map<Integer, Student> students = generateStudentsMap(100);
        final Map<Integer, Result> results = generateResultMap(100);

        Integer topStudentScore = topStudentScore(results);
        System.out.println("Ocena najlepszego studenta: " + topStudentScore);

        String topStudentName = topStudentName(students, results);
        System.out.println("Imie(nazwa) najlepszego studenta: " + topStudentName);

        List<Result> correctedGrades = correctGrades(results);
        System.out.println(correctedGrades);

        List<Student> studentsWithScoreHigherThen50 = getStudentsWithScoreHigherThan50(students, results);
        System.out.println(studentsWithScoreHigherThen50);

        List<String> studentsWithGrades = getStudentsWithGrades(students, results);
        System.out.println(studentsWithGrades);
    }

    static List<String> getStudentsWithGrades(Map<Integer, Student> students, Map<Integer, Result> results) {
        List<String> list = new ArrayList<>();
        Collection<Result> values = results.values();

        for (Result result : values)
            if (students.containsKey(result.studentId)) {
                Student student = students.get(result.studentId);
                list.add(student.name);
                list.add(result.grade);
            }


        return list;
    }


    static List<Result> correctGrades(Map<Integer, Result> results) {
        Collection<Result> values = results.values();
        //każda ocena niezależnie od wartości (score), posiada grade = 'A'
        //popraw grade w następujący sposób:
        //score 0 - 20 -> grade E
        //score 21 - 40 -> grade D
        //score 41 - 60 -> grade C
        //score 61 - 80 -> grade B
        //score 81 - 100 -> grade A


        for (Result result : values) {
            if (result.score >= 0 && result.score <= 20) {
                result.grade = "E";
            } else if (result.score >= 21 && result.score <= 40) {
                result.grade = "D";
            } else if (result.score >= 41 && result.score <= 60) {
                result.grade = "C";
            } else if (result.score >= 61 && result.score <= 80) {
                result.grade = "B";
            } else if (result.score >= 81 && result.score <= 100) {
                result.grade = "A";
            }
        }
        return new ArrayList<>(values);
    }

    static Integer topStudentScore(Map<Integer, Result> results) {
        //zwróć najwyższy wynik
        Collection<Result> values = results.values();
        Result highest = new Result(0, 0, 0, "");
        for (Result result : values) {
            if (result.score > highest.score) {
                highest = result;
            }
        }
        return highest.score;
    }

    static String topStudentName(Map<Integer, Student> students, Map<Integer, Result> results) {
        String name = "nie znaleziono studenta";
        Collection<Result> values = results.values();
        Result highestScore = new Result(0, 0, 0, "");
        for (Result result : values) {
            if (result.score == highestScore.score) {
                highestScore = result;
            }
        }
        if (students.containsKey(highestScore.studentId)) {
            Student student = students.get(highestScore.studentId);
            return student.name;
        }


        //zwróc imie studenta, który uzyskał najwyższą ocenę
        return name;
    }

    static List<Student> getStudentsWithScoreHigherThan50(Map<Integer, Student> students, Map<Integer, Result> results) {
        List<Student> list = new ArrayList<>();
        List<Result> wyniki = new ArrayList<>();

        Collection<Result> values = results.values();

        for (Result result : values) {
            if (result.score > 50) {
                wyniki.add(result);
            }
        }
        for (Result result : wyniki) {
            if (students.containsKey(result.studentId)) {
                Student student = students.get(result.studentId);
                list.add(student);
            }


        }
        //zwróc listę studentów z ocenami wyższymi od 50
        return list;
    }

    static Map<Integer, Student> generateStudentsMap(int size) {
        Map<Integer, Student> students = new HashMap<>(size);
        Random generator = new Random();
        while (size > 0) {
            int studentId = generator.nextInt(100);
            String name = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
            String university = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
            students.put(studentId, new Student(studentId, name, university));
            size--;
        }
        return students;
    }

    static Map<Integer, Result> generateResultMap(int size) {
        Map<Integer, Result> results = new HashMap<>(size);
        Random generator = new Random();
        while (size > 0) {
            int studentId = generator.nextInt(100);
            int resultId = generator.nextInt(100);
            int score = generator.nextInt(100);
            results.put(studentId, new Result(studentId, resultId, score, "A"));
            size--;
        }
        return results;
    }
}
