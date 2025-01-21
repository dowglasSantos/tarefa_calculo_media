public class Main {
    public static void main(String[] args) {
        MedCalculator medCalculator = new MedCalculator();



        float noteOne = 6f;
        float noteTwo = 6.7f;
        float noteTree = 7.9f;
        float noteFor = 7.9f;

        medCalculator.setNoteOne(noteOne);
        medCalculator.setNoteTwo(noteTwo);
        medCalculator.setNoteTree(noteTree);
        medCalculator.setNoteFor(noteFor);


        System.out.println("Primeira Nota: " + medCalculator.getNoteOne());
        System.out.println("Segunda Nota: " + medCalculator.getNoteTwo());clea
        System.out.println("Terceira Nota: " + medCalculator.getNoteTree());
        System.out.println("Quarta Nota: " + medCalculator.getNoteFor());


        float media = (noteOne + noteTwo + noteTree + noteFor) / 4;

        if(media >= 7) {
            System.out.println("Aprovado, sua media foi: " + media);
        } else if(media >= 6 && media < 7) {
            System.out.println("Recuperacao, sua media foi: " + media);
        } else if(media < 6) {
            System.out.println("Reprovado, sua media foi: " + media);
        };

    };
}