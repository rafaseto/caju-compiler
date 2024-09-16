/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.analysis;

import caju.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseADecVariavel(ADecVariavel node);
    void caseAListaNomes(AListaNomes node);
    void caseAVirgulaId(AVirgulaId node);
    void caseABaseTipo(ABaseTipo node);
    void caseAVetorTipo(AVetorTipo node);
    void caseAExpColchete(AExpColchete node);
    void caseANumeroTipoBase(ANumeroTipoBase node);
    void caseACaractereTipoBase(ACaractereTipoBase node);
    void caseABooleanoTipoBase(ABooleanoTipoBase node);
    void caseADecFuncao(ADecFuncao node);
    void caseATipoTipoRetorno(ATipoTipoRetorno node);
    void caseAVazioTipoRetorno(AVazioTipoRetorno node);
    void caseAVazioParametros(AVazioParametros node);
    void caseAParametroParametros(AParametroParametros node);
    void caseAPipeParametro(APipeParametro node);
    void caseAParametro(AParametro node);
    void caseABloco(ABloco node);
    void caseAAtrib(AAtrib node);
    void caseAListaAtrib(AListaAtrib node);
    void caseAVirgulaAtrib(AVirgulaAtrib node);
    void caseASeComando(ASeComando node);
    void caseASeSenaoComando(ASeSenaoComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaCadaComando(AParaCadaComando node);
    void caseAAtribComando(AAtribComando node);
    void caseARetorneComando(ARetorneComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseAChamadaComando(AChamadaComando node);
    void caseAIdVar(AIdVar node);
    void caseAVarVar(AVarVar node);
    void caseANumeroExp(ANumeroExp node);
    void caseACaractereExp(ACaractereExp node);
    void caseABooleanoExp(ABooleanoExp node);
    void caseAVarExp(AVarExp node);
    void caseAExpExp(AExpExp node);
    void caseAChamadaExp(AChamadaExp node);
    void caseAMaisExp(AMaisExp node);
    void caseAMenosExp(AMenosExp node);
    void caseAMultExp(AMultExp node);
    void caseADivExp(ADivExp node);
    void caseAIgualExp(AIgualExp node);
    void caseAMenorIgualExp(AMenorIgualExp node);
    void caseAMaiorIgualExp(AMaiorIgualExp node);
    void caseAMenorExp(AMenorExp node);
    void caseAMaiorExp(AMaiorExp node);
    void caseANaoExp(ANaoExp node);
    void caseAEExp(AEExp node);
    void caseAOuExp(AOuExp node);
    void caseAChamada(AChamada node);
    void caseAVazioListaExp(AVazioListaExp node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAPipeExp(APipeExp node);

    void caseTIgnorar(TIgnorar node);
    void caseTBaseCaractere(TBaseCaractere node);
    void caseTBaseNumero(TBaseNumero node);
    void caseTBaseBooleano(TBaseBooleano node);
    void caseTVetor(TVetor node);
    void caseTVazio(TVazio node);
    void caseTCaractere(TCaractere node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalso(TFalso node);
    void caseTBooleano(TBooleano node);
    void caseTNumero(TNumero node);
    void caseTVetorUnidimensional(TVetorUnidimensional node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTComentLinha(TComentLinha node);
    void caseTComentBloco(TComentBloco node);
    void caseTEnquanto(TEnquanto node);
    void caseTPara(TPara node);
    void caseTParaCada(TParaCada node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTRetorne(TRetorne node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMaior(TMaior node);
    void caseTMenor(TMenor node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTIgual(TIgual node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTAtribuir(TAtribuir node);
    void caseTPontoFinal(TPontoFinal node);
    void caseTExibir(TExibir node);
    void caseTLer(TLer node);
    void caseTVirgula(TVirgula node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTSeta(TSeta node);
    void caseTAbreParenteses(TAbreParenteses node);
    void caseTFechaParenteses(TFechaParenteses node);
    void caseTPipe(TPipe node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
