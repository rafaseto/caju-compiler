/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import java.util.*;
import caju.analysis.*;

@SuppressWarnings("nls")
public final class AArProgramaAPrograma extends PAPrograma
{
    private final LinkedList<PADecVariavel> _aDecVariavel_ = new LinkedList<PADecVariavel>();
    private final LinkedList<PADecFuncao> _aDecFuncao_ = new LinkedList<PADecFuncao>();

    public AArProgramaAPrograma()
    {
        // Constructor
    }

    public AArProgramaAPrograma(
        @SuppressWarnings("hiding") List<?> _aDecVariavel_,
        @SuppressWarnings("hiding") List<?> _aDecFuncao_)
    {
        // Constructor
        setADecVariavel(_aDecVariavel_);

        setADecFuncao(_aDecFuncao_);

    }

    @Override
    public Object clone()
    {
        return new AArProgramaAPrograma(
            cloneList(this._aDecVariavel_),
            cloneList(this._aDecFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArProgramaAPrograma(this);
    }

    public LinkedList<PADecVariavel> getADecVariavel()
    {
        return this._aDecVariavel_;
    }

    public void setADecVariavel(List<?> list)
    {
        for(PADecVariavel e : this._aDecVariavel_)
        {
            e.parent(null);
        }
        this._aDecVariavel_.clear();

        for(Object obj_e : list)
        {
            PADecVariavel e = (PADecVariavel) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aDecVariavel_.add(e);
        }
    }

    public LinkedList<PADecFuncao> getADecFuncao()
    {
        return this._aDecFuncao_;
    }

    public void setADecFuncao(List<?> list)
    {
        for(PADecFuncao e : this._aDecFuncao_)
        {
            e.parent(null);
        }
        this._aDecFuncao_.clear();

        for(Object obj_e : list)
        {
            PADecFuncao e = (PADecFuncao) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._aDecFuncao_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aDecVariavel_)
            + toString(this._aDecFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aDecVariavel_.remove(child))
        {
            return;
        }

        if(this._aDecFuncao_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PADecVariavel> i = this._aDecVariavel_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PADecVariavel) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PADecFuncao> i = this._aDecFuncao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PADecFuncao) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
