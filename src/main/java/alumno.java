/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yamila
 */
public class alumno {

    String getNumeroDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void verDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPorcentajeBeca(String tipoBeca, float porcentaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 public class Alumno {
    private String nombre;
    private final String tipoDocumento;
    private String numeroDocumento;
    private char nivelSocioeconomico;
    private String tipoBeca;
    private float porcentajeBeca;
    private float pensionBase;
    private float montoPensionFinal;

    public Alumno(String nombre, String tipoDocumento, String numeroDocumento, char nivelSocioeconomico) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nivelSocioeconomico = nivelSocioeconomico;
        this.setumeroDocumento(tipoDocumento, numeroDocumento);
        this.pensionBase = asignarPensionBase(nivelSocioeconomico);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public boolean setNumeroDocumento(String tipo, String numero) {
        if (tipo.equals("DNI") && numero.length() == 8) {
            this.numeroDocumento = numero;
            return true;
        } else if (tipo.equals("CE") && numero.length() == 11) {
            this.numeroDocumento = numero;
            return true;
        } else {
            System.out.println("Error: documento invalido para el tipo " + tipo);
            return false;
        }
    }

    public char getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }
    public void setNivelSocioeconomico(char nivel) {
        this.nivelSocioeconomico = nivel;
        this.pensionBase = asignarPensionBase(nivel);
    }

    public void setPorcentajeBeca(String tipoBeca, float porcentaje) {
        this.tipoBeca = tipoBeca;
        this.porcentajeBeca = porcentaje;
    }

    private float asignarPensionBase(char nivel) {
        switch (nivel) {
            case 'A' -> {
                return 500.0f;
            }
            case 'B' -> {
                return 350.0f;
            }
            case 'C' -> {
                return 200.0f;
            }
            default -> {
                System.out.println("Nivel invalido, se asigna pension base 0.");
                return 0.0f;
            }
        }
    }

    public float calcularPensionFinal() {
        float descuento = this.pensionBase * (this.porcentajeBeca / 100);
        this.montoPensionFinal = this.pensionBase - descuento;
        return this.montoPensionFinal;
    }

    public void verDatos() {
        System.out.println("Alumno");
        System.out.println("Nombre            : " + this.nombre);
        System.out.println("Tipo documento    : " + this.tipoDocumento);
        System.out.println("Numero documento  : " + this.numeroDocumento);
        System.out.println("Nivel socioeconomico: " + this.nivelSocioeconomico);
        System.out.println("Tipo de beca      : " + this.tipoBeca);
        System.out.println("Porcentaje beca   : " + this.porcentajeBeca + "%");
        System.out.println("Pension base      : S/ " + this.pensionBase);
        System.out.println("Pension final     : S/ " + this.calcularPensionFinal());
    }

        private void setumeroDocumento(String tipoDocumento, String numeroDocumento) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
