import React from 'react';
import '../assets/css/modalServiceDetails.css';

class ModalServiceDetails extends React.Component {
    render() {
        return (
            <div>
                <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                    <div class="modal-dialog modal-dialog-centered" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title" id="exampleModalCenterTitle">Detalhes do serviço agendado</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <div className="p-2">
                                    <div className="row">
                                        <label className="dataClient">Cliente: </label>
                                        <label><em>Marcia Silva</em></label>
                                    </div>
                                    <div className="row">
                                        <label className="dataClient">Horário: </label>
                                        <label><em>14:00h</em></label>
                                    </div>
                                    <div className="row">
                                        <label className="dataClient">Local: </label>
                                        <label><em>Av. Paulista, 535</em></label>
                                    </div>
                                    <div className="row">
                                        <label className="dataClient">Observações do cliente: </label>
                                        <label className="border"></label>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer justify-content-center">
                                <input type="button" className="w-25" id="btnReprovar" data-dismiss="modal" value="Reprovar" />
                                <input type="button" className="w-25" id="btnAprovar" value="Aprovar" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default ModalServiceDetails;