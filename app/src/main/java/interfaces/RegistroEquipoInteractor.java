package interfaces;

import android.content.Context;

public interface RegistroEquipoInteractor {
    void registrarEquipo(String codigo, String marca, String modelo, RegistroEquipoPresenter presenter, Context contexto);
}
