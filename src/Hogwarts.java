public class Hogwarts {

    public void compareGriffindorStudent(GriffindorStudent first, GriffindorStudent second) {
        var firstPoints = first.getBravery() + first.getHonor() + first.getNobility();
        var secondPoints = second.getBravery() + second.getHonor() + second.getNobility();

        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " и " + first.getName() + " равны");
        }

    }

    public void compareAnyStudent(HogwartsStudent first, HogwartsStudent second) {
        var firstPoints = first.getMagicPower() + first.getTransgressionDistance();
        var secondPoints = second.getMagicPower() + second.getTransgressionDistance();

        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " и " + first.getName() + " равны");
        }
    }
}
