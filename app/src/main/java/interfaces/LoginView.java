package interfaces;

public interface LoginView {

    void mostrarProgreso();
    void esconderProgreso();
    void setErrorUser();
    void setErrorPassword();
    void exito(String nombre);
    void noExiste();

}
