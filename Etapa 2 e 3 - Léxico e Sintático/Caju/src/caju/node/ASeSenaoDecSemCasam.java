/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ASeSenaoDecSemCasam extends PDecSemCasam
{
    private TSe _se_;
    private TAbreParenteses _abreParenteses_;
    private PExp _exp_;
    private TFechaParenteses _fechaParenteses_;
    private PDecCasam _decCasam_;
    private TSenao _senao_;
    private PDecSemCasam _decSemCasam_;

    public ASeSenaoDecSemCasam()
    {
        // Constructor
    }

    public ASeSenaoDecSemCasam(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_,
        @SuppressWarnings("hiding") PDecCasam _decCasam_,
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") PDecSemCasam _decSemCasam_)
    {
        // Constructor
        setSe(_se_);

        setAbreParenteses(_abreParenteses_);

        setExp(_exp_);

        setFechaParenteses(_fechaParenteses_);

        setDecCasam(_decCasam_);

        setSenao(_senao_);

        setDecSemCasam(_decSemCasam_);

    }

    @Override
    public Object clone()
    {
        return new ASeSenaoDecSemCasam(
            cloneNode(this._se_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._exp_),
            cloneNode(this._fechaParenteses_),
            cloneNode(this._decCasam_),
            cloneNode(this._senao_),
            cloneNode(this._decSemCasam_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeSenaoDecSemCasam(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
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

    public PDecCasam getDecCasam()
    {
        return this._decCasam_;
    }

    public void setDecCasam(PDecCasam node)
    {
        if(this._decCasam_ != null)
        {
            this._decCasam_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decCasam_ = node;
    }

    public TSenao getSenao()
    {
        return this._senao_;
    }

    public void setSenao(TSenao node)
    {
        if(this._senao_ != null)
        {
            this._senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senao_ = node;
    }

    public PDecSemCasam getDecSemCasam()
    {
        return this._decSemCasam_;
    }

    public void setDecSemCasam(PDecSemCasam node)
    {
        if(this._decSemCasam_ != null)
        {
            this._decSemCasam_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decSemCasam_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._abreParenteses_)
            + toString(this._exp_)
            + toString(this._fechaParenteses_)
            + toString(this._decCasam_)
            + toString(this._senao_)
            + toString(this._decSemCasam_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
            return;
        }

        if(this._decCasam_ == child)
        {
            this._decCasam_ = null;
            return;
        }

        if(this._senao_ == child)
        {
            this._senao_ = null;
            return;
        }

        if(this._decSemCasam_ == child)
        {
            this._decSemCasam_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        if(this._decCasam_ == oldChild)
        {
            setDecCasam((PDecCasam) newChild);
            return;
        }

        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._decSemCasam_ == oldChild)
        {
            setDecSemCasam((PDecSemCasam) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
