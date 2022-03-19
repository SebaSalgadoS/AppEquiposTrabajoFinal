package presenter;

import android.content.Context;

import interactor.RegistroEquipoInteractorImpl;
import interfaces.RegistroEquipoInteractor;
import interfaces.RegistroEquipoPresenter;
import interfaces.RegistroEquipoView;

public class RegistroEquipoPresenterImpl implements RegistroEquipoPresenter {

    RegistroEquipoView vista;
    RegistroEquipoInteractor interactor;

    public RegistroEquipoPresenterImpl(RegistroEquipoView vista){
        this.vista = vista;
        interactor = new RegistroEquipoInteractorImpl();
    }

    @Override
    public void registrarEquipo(String codigo, String marca, String modelo, Context contexto) {
        interactor.registrarEquipo(codigo, marca, modelo, this, contexto);
    }

    @Override
    public void errorEquipo() {
        vista.errorEquipo();
    }

    @Override
    public void exitoEquipo() {
        vista.exitoEquipo();
    }

    @Override
    public void setErrorCodigo() {
        vista.setErrorCodigo();
    }

    @Override
    public void setErrorMarca() {
        vista.setErrorMarca();
    }

    @Override
    public void setErrorModelo() {
        vista.setErrorModelo();
    }
}
