/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.analysis;

import java.util.*;
import caju.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PDecFuncao> copy = new ArrayList<PDecFuncao>(node.getDecFuncao());
            Collections.reverse(copy);
            for(PDecFuncao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDecVariavel> copy = new ArrayList<PDecVariavel>(node.getDecVariavel());
            Collections.reverse(copy);
            for(PDecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inADecVariavel(ADecVariavel node)
    {
        defaultIn(node);
    }

    public void outADecVariavel(ADecVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVariavel(ADecVariavel node)
    {
        inADecVariavel(node);
        if(node.getPontoFinal() != null)
        {
            node.getPontoFinal().apply(this);
        }
        if(node.getListaNomes() != null)
        {
            node.getListaNomes().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outADecVariavel(node);
    }

    public void inAListaNomes(AListaNomes node)
    {
        defaultIn(node);
    }

    public void outAListaNomes(AListaNomes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaNomes(AListaNomes node)
    {
        inAListaNomes(node);
        {
            List<PVirgulaId> copy = new ArrayList<PVirgulaId>(node.getVirgulaId());
            Collections.reverse(copy);
            for(PVirgulaId e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAListaNomes(node);
    }

    public void inAVirgulaId(AVirgulaId node)
    {
        defaultIn(node);
    }

    public void outAVirgulaId(AVirgulaId node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVirgulaId(AVirgulaId node)
    {
        inAVirgulaId(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAVirgulaId(node);
    }

    public void inABaseTipo(ABaseTipo node)
    {
        defaultIn(node);
    }

    public void outABaseTipo(ABaseTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABaseTipo(ABaseTipo node)
    {
        inABaseTipo(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outABaseTipo(node);
    }

    public void inAVetorTipo(AVetorTipo node)
    {
        defaultIn(node);
    }

    public void outAVetorTipo(AVetorTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorTipo(AVetorTipo node)
    {
        inAVetorTipo(node);
        {
            List<PExpColchete> copy = new ArrayList<PExpColchete>(node.getDir());
            Collections.reverse(copy);
            for(PExpColchete e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        if(node.getVetor() != null)
        {
            node.getVetor().apply(this);
        }
        outAVetorTipo(node);
    }

    public void inAExpColchete(AExpColchete node)
    {
        defaultIn(node);
    }

    public void outAExpColchete(AExpColchete node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpColchete(AExpColchete node)
    {
        inAExpColchete(node);
        if(node.getFechaColchete() != null)
        {
            node.getFechaColchete().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAbreColchete() != null)
        {
            node.getAbreColchete().apply(this);
        }
        outAExpColchete(node);
    }

    public void inANumeroTipoBase(ANumeroTipoBase node)
    {
        defaultIn(node);
    }

    public void outANumeroTipoBase(ANumeroTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroTipoBase(ANumeroTipoBase node)
    {
        inANumeroTipoBase(node);
        if(node.getBaseNumero() != null)
        {
            node.getBaseNumero().apply(this);
        }
        outANumeroTipoBase(node);
    }

    public void inACaractereTipoBase(ACaractereTipoBase node)
    {
        defaultIn(node);
    }

    public void outACaractereTipoBase(ACaractereTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereTipoBase(ACaractereTipoBase node)
    {
        inACaractereTipoBase(node);
        if(node.getBaseCaractere() != null)
        {
            node.getBaseCaractere().apply(this);
        }
        outACaractereTipoBase(node);
    }

    public void inABooleanoTipoBase(ABooleanoTipoBase node)
    {
        defaultIn(node);
    }

    public void outABooleanoTipoBase(ABooleanoTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanoTipoBase(ABooleanoTipoBase node)
    {
        inABooleanoTipoBase(node);
        if(node.getBaseBooleano() != null)
        {
            node.getBaseBooleano().apply(this);
        }
        outABooleanoTipoBase(node);
    }

    public void inADecFuncao(ADecFuncao node)
    {
        defaultIn(node);
    }

    public void outADecFuncao(ADecFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        inADecFuncao(node);
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getParametros() != null)
        {
            node.getParametros().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTipoRetorno() != null)
        {
            node.getTipoRetorno().apply(this);
        }
        if(node.getSeta() != null)
        {
            node.getSeta().apply(this);
        }
        outADecFuncao(node);
    }

    public void inATipoTipoRetorno(ATipoTipoRetorno node)
    {
        defaultIn(node);
    }

    public void outATipoTipoRetorno(ATipoTipoRetorno node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoTipoRetorno(ATipoTipoRetorno node)
    {
        inATipoTipoRetorno(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outATipoTipoRetorno(node);
    }

    public void inAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        defaultIn(node);
    }

    public void outAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioTipoRetorno(AVazioTipoRetorno node)
    {
        inAVazioTipoRetorno(node);
        if(node.getVazio() != null)
        {
            node.getVazio().apply(this);
        }
        outAVazioTipoRetorno(node);
    }

    public void inAVazioParametros(AVazioParametros node)
    {
        defaultIn(node);
    }

    public void outAVazioParametros(AVazioParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioParametros(AVazioParametros node)
    {
        inAVazioParametros(node);
        outAVazioParametros(node);
    }

    public void inAParametroParametros(AParametroParametros node)
    {
        defaultIn(node);
    }

    public void outAParametroParametros(AParametroParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametroParametros(AParametroParametros node)
    {
        inAParametroParametros(node);
        {
            List<PPipeParametro> copy = new ArrayList<PPipeParametro>(node.getPipeParametro());
            Collections.reverse(copy);
            for(PPipeParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getParametro() != null)
        {
            node.getParametro().apply(this);
        }
        outAParametroParametros(node);
    }

    public void inAPipeParametro(APipeParametro node)
    {
        defaultIn(node);
    }

    public void outAPipeParametro(APipeParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPipeParametro(APipeParametro node)
    {
        inAPipeParametro(node);
        if(node.getParametro() != null)
        {
            node.getParametro().apply(this);
        }
        if(node.getPipe() != null)
        {
            node.getPipe().apply(this);
        }
        outAPipeParametro(node);
    }

    public void inAParametro(AParametro node)
    {
        defaultIn(node);
    }

    public void outAParametro(AParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        inAParametro(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAParametro(node);
    }

    public void inABloco(ABloco node)
    {
        defaultIn(node);
    }

    public void outABloco(ABloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        inABloco(node);
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDecVariavel> copy = new ArrayList<PDecVariavel>(node.getDecVariavel());
            Collections.reverse(copy);
            for(PDecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        outABloco(node);
    }

    public void inAAtrib(AAtrib node)
    {
        defaultIn(node);
    }

    public void outAAtrib(AAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtrib(AAtrib node)
    {
        inAAtrib(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAtribuir() != null)
        {
            node.getAtribuir().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAAtrib(node);
    }

    public void inAListaAtrib(AListaAtrib node)
    {
        defaultIn(node);
    }

    public void outAListaAtrib(AListaAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaAtrib(AListaAtrib node)
    {
        inAListaAtrib(node);
        {
            List<PVirgulaAtrib> copy = new ArrayList<PVirgulaAtrib>(node.getVirgulaAtrib());
            Collections.reverse(copy);
            for(PVirgulaAtrib e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        outAListaAtrib(node);
    }

    public void inAVirgulaAtrib(AVirgulaAtrib node)
    {
        defaultIn(node);
    }

    public void outAVirgulaAtrib(AVirgulaAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVirgulaAtrib(AVirgulaAtrib node)
    {
        inAVirgulaAtrib(node);
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAVirgulaAtrib(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getSe() != null)
        {
            node.getSe().apply(this);
        }
        outASeComando(node);
    }

    public void inASeSenaoComando(ASeSenaoComando node)
    {
        defaultIn(node);
    }

    public void outASeSenaoComando(ASeSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeSenaoComando(ASeSenaoComando node)
    {
        inASeSenaoComando(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getSe() != null)
        {
            node.getSe().apply(this);
        }
        outASeSenaoComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getEnquanto() != null)
        {
            node.getEnquanto().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getDirLista() != null)
        {
            node.getDirLista().apply(this);
        }
        if(node.getDirPonto() != null)
        {
            node.getDirPonto().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getEsqPonto() != null)
        {
            node.getEsqPonto().apply(this);
        }
        if(node.getEsqLista() != null)
        {
            node.getEsqLista().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        outAParaComando(node);
    }

    public void inAParaCadaComando(AParaCadaComando node)
    {
        defaultIn(node);
    }

    public void outAParaCadaComando(AParaCadaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaCadaComando(AParaCadaComando node)
    {
        inAParaCadaComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getParaCada() != null)
        {
            node.getParaCada().apply(this);
        }
        outAParaCadaComando(node);
    }

    public void inAAtribComando(AAtribComando node)
    {
        defaultIn(node);
    }

    public void outAAtribComando(AAtribComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtribComando(AAtribComando node)
    {
        inAAtribComando(node);
        if(node.getPontoFinal() != null)
        {
            node.getPontoFinal().apply(this);
        }
        if(node.getAtrib() != null)
        {
            node.getAtrib().apply(this);
        }
        outAAtribComando(node);
    }

    public void inARetorneComando(ARetorneComando node)
    {
        defaultIn(node);
    }

    public void outARetorneComando(ARetorneComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARetorneComando(ARetorneComando node)
    {
        inARetorneComando(node);
        if(node.getPontoFinal() != null)
        {
            node.getPontoFinal().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRetorne() != null)
        {
            node.getRetorne().apply(this);
        }
        outARetorneComando(node);
    }

    public void inABlocoComando(ABlocoComando node)
    {
        defaultIn(node);
    }

    public void outABlocoComando(ABlocoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoComando(ABlocoComando node)
    {
        inABlocoComando(node);
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outABlocoComando(node);
    }

    public void inAChamadaComando(AChamadaComando node)
    {
        defaultIn(node);
    }

    public void outAChamadaComando(AChamadaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaComando(AChamadaComando node)
    {
        inAChamadaComando(node);
        if(node.getPontoFinal() != null)
        {
            node.getPontoFinal().apply(this);
        }
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAChamadaComando(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVar(node);
    }

    public void inAVarVar(AVarVar node)
    {
        defaultIn(node);
    }

    public void outAVarVar(AVarVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarVar(AVarVar node)
    {
        inAVarVar(node);
        if(node.getFechaColchete() != null)
        {
            node.getFechaColchete().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAbreColchete() != null)
        {
            node.getAbreColchete().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarVar(node);
    }

    public void inANumeroExp(ANumeroExp node)
    {
        defaultIn(node);
    }

    public void outANumeroExp(ANumeroExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroExp(ANumeroExp node)
    {
        inANumeroExp(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outANumeroExp(node);
    }

    public void inACaractereExp(ACaractereExp node)
    {
        defaultIn(node);
    }

    public void outACaractereExp(ACaractereExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaractereExp(ACaractereExp node)
    {
        inACaractereExp(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outACaractereExp(node);
    }

    public void inABooleanoExp(ABooleanoExp node)
    {
        defaultIn(node);
    }

    public void outABooleanoExp(ABooleanoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanoExp(ABooleanoExp node)
    {
        inABooleanoExp(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outABooleanoExp(node);
    }

    public void inAVarExp(AVarExp node)
    {
        defaultIn(node);
    }

    public void outAVarExp(AVarExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExp(AVarExp node)
    {
        inAVarExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarExp(node);
    }

    public void inAExpExp(AExpExp node)
    {
        defaultIn(node);
    }

    public void outAExpExp(AExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpExp(AExpExp node)
    {
        inAExpExp(node);
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        outAExpExp(node);
    }

    public void inAChamadaExp(AChamadaExp node)
    {
        defaultIn(node);
    }

    public void outAChamadaExp(AChamadaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaExp(AChamadaExp node)
    {
        inAChamadaExp(node);
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAChamadaExp(node);
    }

    public void inAMaisExp(AMaisExp node)
    {
        defaultIn(node);
    }

    public void outAMaisExp(AMaisExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExp(AMaisExp node)
    {
        inAMaisExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMais() != null)
        {
            node.getMais().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMaisExp(node);
    }

    public void inAMenosExp(AMenosExp node)
    {
        defaultIn(node);
    }

    public void outAMenosExp(AMenosExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        inAMenosExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMenosExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMultExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outADivExp(node);
    }

    public void inAIgualExp(AIgualExp node)
    {
        defaultIn(node);
    }

    public void outAIgualExp(AIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExp(AIgualExp node)
    {
        inAIgualExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAIgualExp(node);
    }

    public void inAMenorIgualExp(AMenorIgualExp node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualExp(AMenorIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualExp(AMenorIgualExp node)
    {
        inAMenorIgualExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMenorIgualExp(node);
    }

    public void inAMaiorIgualExp(AMaiorIgualExp node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualExp(AMaiorIgualExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualExp(AMaiorIgualExp node)
    {
        inAMaiorIgualExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMaiorIgualExp(node);
    }

    public void inAMenorExp(AMenorExp node)
    {
        defaultIn(node);
    }

    public void outAMenorExp(AMenorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExp(AMenorExp node)
    {
        inAMenorExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMenorExp(node);
    }

    public void inAMaiorExp(AMaiorExp node)
    {
        defaultIn(node);
    }

    public void outAMaiorExp(AMaiorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExp(AMaiorExp node)
    {
        inAMaiorExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAMaiorExp(node);
    }

    public void inANaoExp(ANaoExp node)
    {
        defaultIn(node);
    }

    public void outANaoExp(ANaoExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANaoExp(ANaoExp node)
    {
        inANaoExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outANaoExp(node);
    }

    public void inAEExp(AEExp node)
    {
        defaultIn(node);
    }

    public void outAEExp(AEExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExp(AEExp node)
    {
        inAEExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAEExp(node);
    }

    public void inAOuExp(AOuExp node)
    {
        defaultIn(node);
    }

    public void outAOuExp(AOuExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExp(AOuExp node)
    {
        inAOuExp(node);
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        outAOuExp(node);
    }

    public void inAChamada(AChamada node)
    {
        defaultIn(node);
    }

    public void outAChamada(AChamada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamada(AChamada node)
    {
        inAChamada(node);
        if(node.getFechaParenteses() != null)
        {
            node.getFechaParenteses().apply(this);
        }
        if(node.getListaExp() != null)
        {
            node.getListaExp().apply(this);
        }
        if(node.getAbreParenteses() != null)
        {
            node.getAbreParenteses().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAChamada(node);
    }

    public void inAVazioListaExp(AVazioListaExp node)
    {
        defaultIn(node);
    }

    public void outAVazioListaExp(AVazioListaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioListaExp(AVazioListaExp node)
    {
        inAVazioListaExp(node);
        outAVazioListaExp(node);
    }

    public void inAListaExpListaExp(AListaExpListaExp node)
    {
        defaultIn(node);
    }

    public void outAListaExpListaExp(AListaExpListaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        inAListaExpListaExp(node);
        {
            List<PPipeExp> copy = new ArrayList<PPipeExp>(node.getPipeExp());
            Collections.reverse(copy);
            for(PPipeExp e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAListaExpListaExp(node);
    }

    public void inAPipeExp(APipeExp node)
    {
        defaultIn(node);
    }

    public void outAPipeExp(APipeExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPipeExp(APipeExp node)
    {
        inAPipeExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getPipe() != null)
        {
            node.getPipe().apply(this);
        }
        outAPipeExp(node);
    }
}
