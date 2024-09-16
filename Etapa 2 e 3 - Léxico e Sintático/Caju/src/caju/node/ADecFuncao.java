/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ADecFuncao extends PDecFuncao
{
    private TSeta _seta_;
    private PTipoRetorno _tipoRetorno_;
    private TId _id_;
    private TAbreParenteses _abreParenteses_;
    private PParametros _parametros_;
    private TFechaParenteses _fechaParenteses_;
    private PBloco _bloco_;

    public ADecFuncao()
    {
        // Constructor
    }

    public ADecFuncao(
        @SuppressWarnings("hiding") TSeta _seta_,
        @SuppressWarnings("hiding") PTipoRetorno _tipoRetorno_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_,
        @SuppressWarnings("hiding") PBloco _bloco_)
    {
        // Constructor
        setSeta(_seta_);

        setTipoRetorno(_tipoRetorno_);

        setId(_id_);

        setAbreParenteses(_abreParenteses_);

        setParametros(_parametros_);

        setFechaParenteses(_fechaParenteses_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new ADecFuncao(
            cloneNode(this._seta_),
            cloneNode(this._tipoRetorno_),
            cloneNode(this._id_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._parametros_),
            cloneNode(this._fechaParenteses_),
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFuncao(this);
    }

    public TSeta getSeta()
    {
        return this._seta_;
    }

    public void setSeta(TSeta node)
    {
        if(this._seta_ != null)
        {
            this._seta_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seta_ = node;
    }

    public PTipoRetorno getTipoRetorno()
    {
        return this._tipoRetorno_;
    }

    public void setTipoRetorno(PTipoRetorno node)
    {
        if(this._tipoRetorno_ != null)
        {
            this._tipoRetorno_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoRetorno_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
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

    public PBloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PBloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._seta_)
            + toString(this._tipoRetorno_)
            + toString(this._id_)
            + toString(this._abreParenteses_)
            + toString(this._parametros_)
            + toString(this._fechaParenteses_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._seta_ == child)
        {
            this._seta_ = null;
            return;
        }

        if(this._tipoRetorno_ == child)
        {
            this._tipoRetorno_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
            return;
        }

        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._seta_ == oldChild)
        {
            setSeta((TSeta) newChild);
            return;
        }

        if(this._tipoRetorno_ == oldChild)
        {
            setTipoRetorno((PTipoRetorno) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
