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
    void caseACasamComando(ACasamComando node);
    void caseASemCasamComando(ASemCasamComando node);

    void caseAEnquantoComando(AEnquantoComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaCadaComando(AParaCadaComando node);
    void caseAAtribComando(AAtribComando node);
    void caseARetorneComando(ARetorneComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseAChamadaComando(AChamadaComando node);
    void caseASeComandoCasam(ASeComandoCasam node);
    void caseASeComandoSemCasam(ASeComandoSemCasam node);
    void caseASeSenaoComandoSemCasam(ASeSenaoComandoSemCasam node);
    void caseAIdVar(AIdVar node);
    void caseAIndexadaVar(AIndexadaVar node);
    void caseAVarExp(AVarExp node);
    void caseAChamadaExp(AChamadaExp node);
    void caseACaractereExp(ACaractereExp node);
    void caseABooleanoExp(ABooleanoExp node);
    void caseAOuExp(AOuExp node);
    void caseAExpOuExp(AExpOuExp node);
    void caseAEExpOu(AEExpOu node);
    void caseAExpEExpOu(AExpEExpOu node);
    void caseAIgualExpE(AIgualExpE node);
    void caseAExpIgualExpE(AExpIgualExpE node);
    void caseAMaiorMenorExpIgual(AMaiorMenorExpIgual node);
    void caseAExpCmpExpIgual(AExpCmpExpIgual node);
    void caseAAdicaoSubtracaoExpCmp(AAdicaoSubtracaoExpCmp node);
    void caseAExpTermoExpCmp(AExpTermoExpCmp node);
    void caseAMultiplicacaoDivisaoExpTermo(AMultiplicacaoDivisaoExpTermo node);
    void caseAExpNaoExpTermo(AExpNaoExpTermo node);
    void caseANaoExpNao(ANaoExpNao node);
    void caseAExpFatorExpNao(AExpFatorExpNao node);
    void caseAExpExpFator(AExpExpFator node);
    void caseANumeroExpFator(ANumeroExpFator node);
    void caseAMenorIgualOperadorRelacional(AMenorIgualOperadorRelacional node);
    void caseAMaiorIgualOperadorRelacional(AMaiorIgualOperadorRelacional node);
    void caseAMenorOperadorRelacional(AMenorOperadorRelacional node);
    void caseAMaiorOperadorRelacional(AMaiorOperadorRelacional node);
    void caseAMaisMaisMenos(AMaisMaisMenos node);
    void caseAMenosMaisMenos(AMenosMaisMenos node);
    void caseAMultMultDiv(AMultMultDiv node);
    void caseADivMultDiv(ADivMultDiv node);
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
