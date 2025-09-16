public class CalculoDescuento {
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10.0);
    }
    
    public static void main(String[] args) {
        // Ejemplo 1: Usando descuento por defecto (10%)
        double compra1 = 250.0;
        double descuento1 = calcularDescuento(compra1);
        double totalPagar1 = compra1 - descuento1;
        
        System.out.println("=== COMPRA CON DESCUENTO POR DEFECTO (10%) ===");
        System.out.printf("Monto total de compra: $%.2f%n", compra1);
        System.out.printf("Descuento aplicado: $%.2f%n", descuento1);
        System.out.printf("Monto final a pagar: $%.2f%n", totalPagar1);
        System.out.println();
        
        // Ejemplo 2: Usando descuento específico (15%)
        double compra2 = 350.0;
        double porcentajeDescuento2 = 15.0;
        double descuento2 = calcularDescuento(compra2, porcentajeDescuento2);
        double totalPagar2 = compra2 - descuento2;
        
        System.out.println("=== COMPRA CON DESCUENTO ESPECÍFICO (15%) ===");
        System.out.printf("Monto total de compra: $%.2f%n", compra2);
        System.out.printf("Porcentaje de descuento: %.1f%%%n", porcentajeDescuento2);
        System.out.printf("Descuento aplicado: $%.2f%n", descuento2);
        System.out.printf("Monto final a pagar: $%.2f%n", totalPagar2);
        System.out.println();
        
        // Ejemplo adicional: Otro descuento específico (20%)
        double compra3 = 500.0;
        double descuento3 = calcularDescuento(compra3, 20.0);
        double totalPagar3 = compra3 - descuento3;
        
        System.out.println("=== COMPRA CON DESCUENTO ESPECÍFICO (20%) ===");
        System.out.printf("Monto total de compra: $%.2f%n", compra3);
        System.out.printf("Descuento aplicado: $%.2f%n", descuento3);
        System.out.printf("Monto final a pagar: $%.2f%n", totalPagar3);
    }
}