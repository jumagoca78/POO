# Guía de Estudio Programación Java

---

## **Crear un Programa en Java**

```java
public class HolaMundo {
    public static void main(String[] args) throws Exception {
        // Poner código aquí
    }
}
```

---

## **Imprimir en Consola**

```java
System.out.println("mensaje");
```

---

## **Librerías e Importación**

```java
import javax.swing.*;
import java.text.DecimalFormat;
```

---

## **Declaración de Variables**

```java
String nombre = "Juan";
int edad = 20;
double altura = 1.75;
boolean esEstudiante = true;
```

---

## **Funciones Matemáticas**

### **Potencia (Math.pow)**
```java
Math.pow(base, exponente);
```

### **Raíz Cuadrada (Math.sqrt)**
```java
Math.sqrt(valor);
```

---

## **Estructuras de Control**

### **Condición If**
```java
if (condición) {
    // Código a ejecutar si la condición es verdadera
}
```

### **Condición Else-If**
```java
if (condición1) {
    // Código a ejecutar si condición1 es verdadera
} else if (condición2) {
    // Código a ejecutar si condición2 es verdadera
} else {
    // Código a ejecutar si ninguna de las condiciones anteriores es verdadera
}
```

### **Switch**
```java
switch (variable) {
    case valor1:
        // Acciones a realizar si variable es igual a valor1
        break;
    case valor2:
        // Acciones a realizar si variable es igual a valor2
        break;
    default:
        // Acciones si ninguno de los casos coincide
}
```

---

## **Estructuras de Repetición**

### **While**
```java
while (condición) {
    // Código a ejecutar
    // Modificación del contador
}
```

### **Do-While**
```java
do {
    // Código a ejecutar
} while (condición);
```

### **For**
```java
for (inicialización; condición; incremento) {
    // Código a ejecutar
}
```

---

## **Operaciones con Cadenas**

### **Verificar si una cadena está vacía**
```java
if (textoMessage.isEmpty()) {
    textoMessage = "No hay ningún mensaje, escribe un mensaje";
}
```

---

## **Incremento y Decremento**

### **Prefijo y Posfijo**
```java
++variable; // Prefijo
variable++; // Posfijo
variable = variable + 1; // Equivalente
```

---

## **Formateo de Números con DecimalFormat**
```java
import java.text.DecimalFormat;

DecimalFormat twoDigits = new DecimalFormat("0.00");
JOptionPane.showMessageDialog(null, "El promedio es: " + twoDigits.format(promedio));
```

---

## **Operadores Lógicos y de Comparación**

### **Operadores Lógicos**
```java
&&  // AND Lógico
||  // OR Lógico
!   // NOT Lógico
^   // XOR Lógico
```

---

## **Salida del Programa**
```java
System.exit(0);
```

---

## **Declaración y Uso de Métodos**

```java
public static int suma(int a, int b) {
    return a + b;
}
```

---

## **Conversión de Tipos (Casting)**
```java
int a = 100;
int b = 54;
double resultado = (double) a / b;
```

---

## **Break y Continue**

### **Break**
```java
while (true) {
    if (condición) {
        break;
    }
}
```

### **Continue**
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // Salta la iteración si i es par
    }
    System.out.println("i = " + i);
}
```

---

## **Arreglos en Java**

### **Declaración y Creación**
```java
int[] numeros = new int[5];
```

### **Recorrer un Arreglo con For**
```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### **Arreglo de Objetos**
```java
class Alumno {
    String nombre;
    int matricula;
    double promedio;

    public Alumno(String nombre, int matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }
}

Alumno[] alumnos = new Alumno[3];
alumnos[0] = new Alumno("Juan", 185218, 9.0);
```

---

## **Pruebas Unitarias con JUnit**

```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestArreglo {
    @Test
    public void testBuscarMaximo() {
        int[] arreglo = {9, 8, 7};
        int resultado = buscarMaximo(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }
}
```

---

## **Generar Números Aleatorios**
```java
int dado = 1 + (int) (Math.random() * 6);
```

---

## **Manejo de Archivos en Java**

```java
import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }
}
```

---

## **Conclusión**
Esta guía resume los principales fundamentos de la programación en Java, incluyendo estructuras de control, arreglos, pruebas unitarias y manejo de archivos. Practica cada sección escribiendo y ejecutando ejemplos en **Visual Studio Code o IntelliJ IDEA**.

