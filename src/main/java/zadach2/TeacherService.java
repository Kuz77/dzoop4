package zadach2;

import org.example.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int score, int age) {

    }

    @Override
    public void create(String name, String objectToTeach, int expirience) {
        Teacher teacher = new Teacher(name, objectToTeach, expirience);
        teachers.add(teacher);
    }
}
