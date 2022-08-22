public class PilaMain {
    public static void main(String[] args) {
        Pila <String>nombres = new Pila(5);

        String personaje1=("Saul");
        String personaje2=("Jimy");
        String personaje3=("Mike");
        String personaje4=("Lalo");
        String personaje5=("Heladio");

        nombres.push(personaje1);
        System.out.println(nombres.peek());
        nombres.push(personaje2);
        System.out.println(nombres.peek());
        nombres.push(personaje3);
        System.out.println(nombres.peek());
        nombres.push(personaje4);
        System.out.println(nombres.peek());
        nombres.push(personaje5);
        System.out.println(nombres.peek());

        System.out.println("Nombre al tope de la pila:");
        System.out.println(nombres.peek());
        System.out.println("Eliminamos el nombre tope.\n");
        nombres.pop();
        System.out.println("Este es el nuevo nombre en el tope de la pila:");
        System.out.println(nombres.peek());

        System.out.println("Invertimos el nombre:");
        System.out.println(nombres.invertirCadena(nombres.peek()));


    }
}
