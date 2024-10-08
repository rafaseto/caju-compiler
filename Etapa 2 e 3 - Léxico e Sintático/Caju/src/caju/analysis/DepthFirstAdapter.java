/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.analysis;

import java.util.*;
import caju.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPAPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        defaultIn(node);
    }

    public void outAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        inAArProgramaAPrograma(node);
        {
            List<PADecVariavel> copy = new ArrayList<PADecVariavel>(node.getADecVariavel());
            for(PADecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PADecFuncao> copy = new ArrayList<PADecFuncao>(node.getADecFuncao());
            for(PADecFuncao e : copy)
            {
                e.apply(this);
            }
        }
        outAArProgramaAPrograma(node);
    }

    public void inAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        defaultIn(node);
    }

    public void outAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        inAArDecVariavelADecVariavel(node);
        if(node.getATipo() != null)
        {
            node.getATipo().apply(this);
        }
        if(node.getAListaNomes() != null)
        {
            node.getAListaNomes().apply(this);
        }
        outAArDecVariavelADecVariavel(node);
    }

    public void inAArListaNomesAListaNomes(AArListaNomesAListaNomes node)
    {
        defaultIn(node);
    }

    public void outAArListaNomesAListaNomes(AArListaNomesAListaNomes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArListaNomesAListaNomes(AArListaNomesAListaNomes node)
    {
        inAArListaNomesAListaNomes(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PAVirgulaId> copy = new ArrayList<PAVirgulaId>(node.getAVirgulaId());
            for(PAVirgulaId e : copy)
            {
                e.apply(this);
            }
        }
        outAArListaNomesAListaNomes(node);
    }

    public void inAArVirgulaIdAVirgulaId(AArVirgulaIdAVirgulaId node)
    {
        defaultIn(node);
    }

    public void outAArVirgulaIdAVirgulaId(AArVirgulaIdAVirgulaId node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArVirgulaIdAVirgulaId(AArVirgulaIdAVirgulaId node)
    {
        inAArVirgulaIdAVirgulaId(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAArVirgulaIdAVirgulaId(node);
    }

    public void inAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        defaultIn(node);
    }

    public void outAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        inAArDecFuncaoADecFuncao(node);
        if(node.getATipoRetorno() != null)
        {
            node.getATipoRetorno().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAParametros() != null)
        {
            node.getAParametros().apply(this);
        }
        if(node.getABloco() != null)
        {
            node.getABloco().apply(this);
        }
        outAArDecFuncaoADecFuncao(node);
    }

    public void inAArParametrosAParametros(AArParametrosAParametros node)
    {
        defaultIn(node);
    }

    public void outAArParametrosAParametros(AArParametrosAParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArParametrosAParametros(AArParametrosAParametros node)
    {
        inAArParametrosAParametros(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        {
            List<PAParametro> copy = new ArrayList<PAParametro>(node.getDir());
            for(PAParametro e : copy)
            {
                e.apply(this);
            }
        }
        outAArParametrosAParametros(node);
    }

    public void inAArParametrosVazioAParametros(AArParametrosVazioAParametros node)
    {
        defaultIn(node);
    }

    public void outAArParametrosVazioAParametros(AArParametrosVazioAParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArParametrosVazioAParametros(AArParametrosVazioAParametros node)
    {
        inAArParametrosVazioAParametros(node);
        outAArParametrosVazioAParametros(node);
    }

    public void inAArParametroAParametro(AArParametroAParametro node)
    {
        defaultIn(node);
    }

    public void outAArParametroAParametro(AArParametroAParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArParametroAParametro(AArParametroAParametro node)
    {
        inAArParametroAParametro(node);
        if(node.getATipo() != null)
        {
            node.getATipo().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAArParametroAParametro(node);
    }

    public void inAArTipoBaseATipo(AArTipoBaseATipo node)
    {
        defaultIn(node);
    }

    public void outAArTipoBaseATipo(AArTipoBaseATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArTipoBaseATipo(AArTipoBaseATipo node)
    {
        inAArTipoBaseATipo(node);
        if(node.getATipoBase() != null)
        {
            node.getATipoBase().apply(this);
        }
        outAArTipoBaseATipo(node);
    }

    public void inAArTipoVetorATipo(AArTipoVetorATipo node)
    {
        defaultIn(node);
    }

    public void outAArTipoVetorATipo(AArTipoVetorATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArTipoVetorATipo(AArTipoVetorATipo node)
    {
        inAArTipoVetorATipo(node);
        if(node.getATipoBase() != null)
        {
            node.getATipoBase().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        {
            List<PAExp> copy = new ArrayList<PAExp>(node.getDir());
            for(PAExp e : copy)
            {
                e.apply(this);
            }
        }
        outAArTipoVetorATipo(node);
    }

    public void inAArNumeroATipoBase(AArNumeroATipoBase node)
    {
        defaultIn(node);
    }

    public void outAArNumeroATipoBase(AArNumeroATipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArNumeroATipoBase(AArNumeroATipoBase node)
    {
        inAArNumeroATipoBase(node);
        if(node.getBaseNumero() != null)
        {
            node.getBaseNumero().apply(this);
        }
        outAArNumeroATipoBase(node);
    }

    public void inAArCaractereATipoBase(AArCaractereATipoBase node)
    {
        defaultIn(node);
    }

    public void outAArCaractereATipoBase(AArCaractereATipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArCaractereATipoBase(AArCaractereATipoBase node)
    {
        inAArCaractereATipoBase(node);
        if(node.getBaseCaractere() != null)
        {
            node.getBaseCaractere().apply(this);
        }
        outAArCaractereATipoBase(node);
    }

    public void inAArBooleanoATipoBase(AArBooleanoATipoBase node)
    {
        defaultIn(node);
    }

    public void outAArBooleanoATipoBase(AArBooleanoATipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBooleanoATipoBase(AArBooleanoATipoBase node)
    {
        inAArBooleanoATipoBase(node);
        if(node.getBaseBooleano() != null)
        {
            node.getBaseBooleano().apply(this);
        }
        outAArBooleanoATipoBase(node);
    }

    public void inAArIdAVar(AArIdAVar node)
    {
        defaultIn(node);
    }

    public void outAArIdAVar(AArIdAVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArIdAVar(AArIdAVar node)
    {
        inAArIdAVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAArIdAVar(node);
    }

    public void inAArIndexadaAVar(AArIndexadaAVar node)
    {
        defaultIn(node);
    }

    public void outAArIndexadaAVar(AArIndexadaAVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArIndexadaAVar(AArIndexadaAVar node)
    {
        inAArIndexadaAVar(node);
        if(node.getAVar() != null)
        {
            node.getAVar().apply(this);
        }
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAArIndexadaAVar(node);
    }

    public void inAArOuAExp(AArOuAExp node)
    {
        defaultIn(node);
    }

    public void outAArOuAExp(AArOuAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArOuAExp(AArOuAExp node)
    {
        inAArOuAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArOuAExp(node);
    }

    public void inAArEAExp(AArEAExp node)
    {
        defaultIn(node);
    }

    public void outAArEAExp(AArEAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArEAExp(AArEAExp node)
    {
        inAArEAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArEAExp(node);
    }

    public void inAArIgualAExp(AArIgualAExp node)
    {
        defaultIn(node);
    }

    public void outAArIgualAExp(AArIgualAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArIgualAExp(AArIgualAExp node)
    {
        inAArIgualAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArIgualAExp(node);
    }

    public void inAArMenorIgualAExp(AArMenorIgualAExp node)
    {
        defaultIn(node);
    }

    public void outAArMenorIgualAExp(AArMenorIgualAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMenorIgualAExp(AArMenorIgualAExp node)
    {
        inAArMenorIgualAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMenorIgualAExp(node);
    }

    public void inAArMaiorIgualAExp(AArMaiorIgualAExp node)
    {
        defaultIn(node);
    }

    public void outAArMaiorIgualAExp(AArMaiorIgualAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMaiorIgualAExp(AArMaiorIgualAExp node)
    {
        inAArMaiorIgualAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMaiorIgualAExp(node);
    }

    public void inAArMenorAExp(AArMenorAExp node)
    {
        defaultIn(node);
    }

    public void outAArMenorAExp(AArMenorAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMenorAExp(AArMenorAExp node)
    {
        inAArMenorAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMenorAExp(node);
    }

    public void inAArMaiorAExp(AArMaiorAExp node)
    {
        defaultIn(node);
    }

    public void outAArMaiorAExp(AArMaiorAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMaiorAExp(AArMaiorAExp node)
    {
        inAArMaiorAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMaiorAExp(node);
    }

    public void inAArMaisAExp(AArMaisAExp node)
    {
        defaultIn(node);
    }

    public void outAArMaisAExp(AArMaisAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMaisAExp(AArMaisAExp node)
    {
        inAArMaisAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMaisAExp(node);
    }

    public void inAArMenosAExp(AArMenosAExp node)
    {
        defaultIn(node);
    }

    public void outAArMenosAExp(AArMenosAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMenosAExp(AArMenosAExp node)
    {
        inAArMenosAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMenosAExp(node);
    }

    public void inAArMultAExp(AArMultAExp node)
    {
        defaultIn(node);
    }

    public void outAArMultAExp(AArMultAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArMultAExp(AArMultAExp node)
    {
        inAArMultAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArMultAExp(node);
    }

    public void inAArDivAExp(AArDivAExp node)
    {
        defaultIn(node);
    }

    public void outAArDivAExp(AArDivAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArDivAExp(AArDivAExp node)
    {
        inAArDivAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArDivAExp(node);
    }

    public void inAArNaoAExp(AArNaoAExp node)
    {
        defaultIn(node);
    }

    public void outAArNaoAExp(AArNaoAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArNaoAExp(AArNaoAExp node)
    {
        inAArNaoAExp(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAArNaoAExp(node);
    }

    public void inAArVarAExp(AArVarAExp node)
    {
        defaultIn(node);
    }

    public void outAArVarAExp(AArVarAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArVarAExp(AArVarAExp node)
    {
        inAArVarAExp(node);
        if(node.getAVar() != null)
        {
            node.getAVar().apply(this);
        }
        outAArVarAExp(node);
    }

    public void inAArChamadaAExp(AArChamadaAExp node)
    {
        defaultIn(node);
    }

    public void outAArChamadaAExp(AArChamadaAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArChamadaAExp(AArChamadaAExp node)
    {
        inAArChamadaAExp(node);
        if(node.getAChamada() != null)
        {
            node.getAChamada().apply(this);
        }
        outAArChamadaAExp(node);
    }

    public void inAArNumeroAExp(AArNumeroAExp node)
    {
        defaultIn(node);
    }

    public void outAArNumeroAExp(AArNumeroAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArNumeroAExp(AArNumeroAExp node)
    {
        inAArNumeroAExp(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outAArNumeroAExp(node);
    }

    public void inAArCaractereAExp(AArCaractereAExp node)
    {
        defaultIn(node);
    }

    public void outAArCaractereAExp(AArCaractereAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArCaractereAExp(AArCaractereAExp node)
    {
        inAArCaractereAExp(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outAArCaractereAExp(node);
    }

    public void inAArBooleanoAExp(AArBooleanoAExp node)
    {
        defaultIn(node);
    }

    public void outAArBooleanoAExp(AArBooleanoAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBooleanoAExp(AArBooleanoAExp node)
    {
        inAArBooleanoAExp(node);
        if(node.getBooleano() != null)
        {
            node.getBooleano().apply(this);
        }
        outAArBooleanoAExp(node);
    }

    public void inAArStringAExp(AArStringAExp node)
    {
        defaultIn(node);
    }

    public void outAArStringAExp(AArStringAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArStringAExp(AArStringAExp node)
    {
        inAArStringAExp(node);
        if(node.getVetorUnidimensional() != null)
        {
            node.getVetorUnidimensional().apply(this);
        }
        outAArStringAExp(node);
    }

    public void inAArChamadaAChamada(AArChamadaAChamada node)
    {
        defaultIn(node);
    }

    public void outAArChamadaAChamada(AArChamadaAChamada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArChamadaAChamada(AArChamadaAChamada node)
    {
        inAArChamadaAChamada(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getAListaExp() != null)
        {
            node.getAListaExp().apply(this);
        }
        outAArChamadaAChamada(node);
    }

    public void inAArListaExpAListaExp(AArListaExpAListaExp node)
    {
        defaultIn(node);
    }

    public void outAArListaExpAListaExp(AArListaExpAListaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArListaExpAListaExp(AArListaExpAListaExp node)
    {
        inAArListaExpAListaExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        {
            List<PAExp> copy = new ArrayList<PAExp>(node.getDir());
            for(PAExp e : copy)
            {
                e.apply(this);
            }
        }
        outAArListaExpAListaExp(node);
    }

    public void inAArListaExpVazioAListaExp(AArListaExpVazioAListaExp node)
    {
        defaultIn(node);
    }

    public void outAArListaExpVazioAListaExp(AArListaExpVazioAListaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArListaExpVazioAListaExp(AArListaExpVazioAListaExp node)
    {
        inAArListaExpVazioAListaExp(node);
        outAArListaExpVazioAListaExp(node);
    }

    public void inAArComandoCasamAComando(AArComandoCasamAComando node)
    {
        defaultIn(node);
    }

    public void outAArComandoCasamAComando(AArComandoCasamAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArComandoCasamAComando(AArComandoCasamAComando node)
    {
        inAArComandoCasamAComando(node);
        if(node.getAComandoCasam() != null)
        {
            node.getAComandoCasam().apply(this);
        }
        outAArComandoCasamAComando(node);
    }

    public void inAArComandoSemCasamAComando(AArComandoSemCasamAComando node)
    {
        defaultIn(node);
    }

    public void outAArComandoSemCasamAComando(AArComandoSemCasamAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArComandoSemCasamAComando(AArComandoSemCasamAComando node)
    {
        inAArComandoSemCasamAComando(node);
        if(node.getAComandoSemCasam() != null)
        {
            node.getAComandoSemCasam().apply(this);
        }
        outAArComandoSemCasamAComando(node);
    }

    public void inAArSeAComandoCasam(AArSeAComandoCasam node)
    {
        defaultIn(node);
    }

    public void outAArSeAComandoCasam(AArSeAComandoCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArSeAComandoCasam(AArSeAComandoCasam node)
    {
        inAArSeAComandoCasam(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        if(node.getAComando() != null)
        {
            node.getAComando().apply(this);
        }
        outAArSeAComandoCasam(node);
    }

    public void inAArSenaoAComandoCasam(AArSenaoAComandoCasam node)
    {
        defaultIn(node);
    }

    public void outAArSenaoAComandoCasam(AArSenaoAComandoCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArSenaoAComandoCasam(AArSenaoAComandoCasam node)
    {
        inAArSenaoAComandoCasam(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        if(node.getAComandoSemCasam() != null)
        {
            node.getAComandoSemCasam().apply(this);
        }
        if(node.getAComandoCasam() != null)
        {
            node.getAComandoCasam().apply(this);
        }
        outAArSenaoAComandoCasam(node);
    }

    public void inAArEnquantoAComandoCasam(AArEnquantoAComandoCasam node)
    {
        defaultIn(node);
    }

    public void outAArEnquantoAComandoCasam(AArEnquantoAComandoCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArEnquantoAComandoCasam(AArEnquantoAComandoCasam node)
    {
        inAArEnquantoAComandoCasam(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        if(node.getAComando() != null)
        {
            node.getAComando().apply(this);
        }
        outAArEnquantoAComandoCasam(node);
    }

    public void inAArParaAComandoCasam(AArParaAComandoCasam node)
    {
        defaultIn(node);
    }

    public void outAArParaAComandoCasam(AArParaAComandoCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArParaAComandoCasam(AArParaAComandoCasam node)
    {
        inAArParaAComandoCasam(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getAComando() != null)
        {
            node.getAComando().apply(this);
        }
        outAArParaAComandoCasam(node);
    }

    public void inAArParaCadaAComandoCasam(AArParaCadaAComandoCasam node)
    {
        defaultIn(node);
    }

    public void outAArParaCadaAComandoCasam(AArParaCadaAComandoCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArParaCadaAComandoCasam(AArParaCadaAComandoCasam node)
    {
        inAArParaCadaAComandoCasam(node);
        if(node.getATipo() != null)
        {
            node.getATipo().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        if(node.getAComando() != null)
        {
            node.getAComando().apply(this);
        }
        outAArParaCadaAComandoCasam(node);
    }

    public void inAArSeSenaoAComandoSemCasam(AArSeSenaoAComandoSemCasam node)
    {
        defaultIn(node);
    }

    public void outAArSeSenaoAComandoSemCasam(AArSeSenaoAComandoSemCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArSeSenaoAComandoSemCasam(AArSeSenaoAComandoSemCasam node)
    {
        inAArSeSenaoAComandoSemCasam(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArSeSenaoAComandoSemCasam(node);
    }

    public void inAArAtribAComandoSemCasam(AArAtribAComandoSemCasam node)
    {
        defaultIn(node);
    }

    public void outAArAtribAComandoSemCasam(AArAtribAComandoSemCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArAtribAComandoSemCasam(AArAtribAComandoSemCasam node)
    {
        inAArAtribAComandoSemCasam(node);
        if(node.getAAtrib() != null)
        {
            node.getAAtrib().apply(this);
        }
        outAArAtribAComandoSemCasam(node);
    }

    public void inAArRetorneAComandoSemCasam(AArRetorneAComandoSemCasam node)
    {
        defaultIn(node);
    }

    public void outAArRetorneAComandoSemCasam(AArRetorneAComandoSemCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArRetorneAComandoSemCasam(AArRetorneAComandoSemCasam node)
    {
        inAArRetorneAComandoSemCasam(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAArRetorneAComandoSemCasam(node);
    }

    public void inAArBlocoAComandoSemCasam(AArBlocoAComandoSemCasam node)
    {
        defaultIn(node);
    }

    public void outAArBlocoAComandoSemCasam(AArBlocoAComandoSemCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBlocoAComandoSemCasam(AArBlocoAComandoSemCasam node)
    {
        inAArBlocoAComandoSemCasam(node);
        if(node.getABloco() != null)
        {
            node.getABloco().apply(this);
        }
        outAArBlocoAComandoSemCasam(node);
    }

    public void inAArChamadaAComandoSemCasam(AArChamadaAComandoSemCasam node)
    {
        defaultIn(node);
    }

    public void outAArChamadaAComandoSemCasam(AArChamadaAComandoSemCasam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArChamadaAComandoSemCasam(AArChamadaAComandoSemCasam node)
    {
        inAArChamadaAComandoSemCasam(node);
        if(node.getAChamada() != null)
        {
            node.getAChamada().apply(this);
        }
        outAArChamadaAComandoSemCasam(node);
    }

    public void inAArBlocoABloco(AArBlocoABloco node)
    {
        defaultIn(node);
    }

    public void outAArBlocoABloco(AArBlocoABloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBlocoABloco(AArBlocoABloco node)
    {
        inAArBlocoABloco(node);
        {
            List<PADecVariavel> copy = new ArrayList<PADecVariavel>(node.getADecVariavel());
            for(PADecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PAComando> copy = new ArrayList<PAComando>(node.getAComando());
            for(PAComando e : copy)
            {
                e.apply(this);
            }
        }
        outAArBlocoABloco(node);
    }

    public void inAArAtribAAtrib(AArAtribAAtrib node)
    {
        defaultIn(node);
    }

    public void outAArAtribAAtrib(AArAtribAAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArAtribAAtrib(AArAtribAAtrib node)
    {
        inAArAtribAAtrib(node);
        if(node.getAVar() != null)
        {
            node.getAVar().apply(this);
        }
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAArAtribAAtrib(node);
    }

    public void inAArListaAtribAListaAtrib(AArListaAtribAListaAtrib node)
    {
        defaultIn(node);
    }

    public void outAArListaAtribAListaAtrib(AArListaAtribAListaAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArListaAtribAListaAtrib(AArListaAtribAListaAtrib node)
    {
        inAArListaAtribAListaAtrib(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        {
            List<PAAtrib> copy = new ArrayList<PAAtrib>(node.getDir());
            for(PAAtrib e : copy)
            {
                e.apply(this);
            }
        }
        outAArListaAtribAListaAtrib(node);
    }

    public void inAArVirgulaAtribAVirgulaAtrib(AArVirgulaAtribAVirgulaAtrib node)
    {
        defaultIn(node);
    }

    public void outAArVirgulaAtribAVirgulaAtrib(AArVirgulaAtribAVirgulaAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArVirgulaAtribAVirgulaAtrib(AArVirgulaAtribAVirgulaAtrib node)
    {
        inAArVirgulaAtribAVirgulaAtrib(node);
        if(node.getAAtrib() != null)
        {
            node.getAAtrib().apply(this);
        }
        outAArVirgulaAtribAVirgulaAtrib(node);
    }

    public void inAArTipoVazioATipoRetorno(AArTipoVazioATipoRetorno node)
    {
        defaultIn(node);
    }

    public void outAArTipoVazioATipoRetorno(AArTipoVazioATipoRetorno node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArTipoVazioATipoRetorno(AArTipoVazioATipoRetorno node)
    {
        inAArTipoVazioATipoRetorno(node);
        outAArTipoVazioATipoRetorno(node);
    }

    public void inAArTipoRetornoATipoRetorno(AArTipoRetornoATipoRetorno node)
    {
        defaultIn(node);
    }

    public void outAArTipoRetornoATipoRetorno(AArTipoRetornoATipoRetorno node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArTipoRetornoATipoRetorno(AArTipoRetornoATipoRetorno node)
    {
        inAArTipoRetornoATipoRetorno(node);
        if(node.getATipo() != null)
        {
            node.getATipo().apply(this);
        }
        outAArTipoRetornoATipoRetorno(node);
    }
}
