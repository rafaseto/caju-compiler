/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AParaComando extends PComando
{
    private TPara _para_;
    private TAbreParenteses _abreParenteses_;
    private PListaAtrib _esqLista_;
    private TPontoVirgula _esqPonto_;
    private PExp _exp_;
    private TPontoVirgula _dirPonto_;
    private PListaAtrib _dirLista_;
    private TFechaParenteses _fechaParenteses_;
    private PComando _comando_;

    public AParaComando()
    {
        // Constructor
    }

    public AParaComando(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PListaAtrib _esqLista_,
        @SuppressWarnings("hiding") TPontoVirgula _esqPonto_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TPontoVirgula _dirPonto_,
        @SuppressWarnings("hiding") PListaAtrib _dirLista_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setPara(_para_);

        setAbreParenteses(_abreParenteses_);

        setEsqLista(_esqLista_);

        setEsqPonto(_esqPonto_);

        setExp(_exp_);

        setDirPonto(_dirPonto_);

        setDirLista(_dirLista_);

        setFechaParenteses(_fechaParenteses_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AParaComando(
            cloneNode(this._para_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._esqLista_),
            cloneNode(this._esqPonto_),
            cloneNode(this._exp_),
            cloneNode(this._dirPonto_),
            cloneNode(this._dirLista_),
            cloneNode(this._fechaParenteses_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComando(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public TAbreParenteses getAbreParenteses()
    {
        return this._abreParenteses_;
    }

    public void setAbreParenteses(TAbreParenteses node)
    {
        if(this._abreParenteses_ != null)
        {
            this._abreParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParenteses_ = node;
    }

    public PListaAtrib getEsqLista()
    {
        return this._esqLista_;
    }

    public void setEsqLista(PListaAtrib node)
    {
        if(this._esqLista_ != null)
        {
            this._esqLista_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esqLista_ = node;
    }

    public TPontoVirgula getEsqPonto()
    {
        return this._esqPonto_;
    }

    public void setEsqPonto(TPontoVirgula node)
    {
        if(this._esqPonto_ != null)
        {
            this._esqPonto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esqPonto_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TPontoVirgula getDirPonto()
    {
        return this._dirPonto_;
    }

    public void setDirPonto(TPontoVirgula node)
    {
        if(this._dirPonto_ != null)
        {
            this._dirPonto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dirPonto_ = node;
    }

    public PListaAtrib getDirLista()
    {
        return this._dirLista_;
    }

    public void setDirLista(PListaAtrib node)
    {
        if(this._dirLista_ != null)
        {
            this._dirLista_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dirLista_ = node;
    }

    public TFechaParenteses getFechaParenteses()
    {
        return this._fechaParenteses_;
    }

    public void setFechaParenteses(TFechaParenteses node)
    {
        if(this._fechaParenteses_ != null)
        {
            this._fechaParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParenteses_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._para_)
            + toString(this._abreParenteses_)
            + toString(this._esqLista_)
            + toString(this._esqPonto_)
            + toString(this._exp_)
            + toString(this._dirPonto_)
            + toString(this._dirLista_)
            + toString(this._fechaParenteses_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._esqLista_ == child)
        {
            this._esqLista_ = null;
            return;
        }

        if(this._esqPonto_ == child)
        {
            this._esqPonto_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._dirPonto_ == child)
        {
            this._dirPonto_ = null;
            return;
        }

        if(this._dirLista_ == child)
        {
            this._dirLista_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._esqLista_ == oldChild)
        {
            setEsqLista((PListaAtrib) newChild);
            return;
        }

        if(this._esqPonto_ == oldChild)
        {
            setEsqPonto((TPontoVirgula) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._dirPonto_ == oldChild)
        {
            setDirPonto((TPontoVirgula) newChild);
            return;
        }

        if(this._dirLista_ == oldChild)
        {
            setDirLista((PListaAtrib) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
