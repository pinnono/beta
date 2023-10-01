package st.fit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder>{

    private List<item> ItemList;
    private Context context;
    public itemAdapter(Context context) {
        this.context = context;
    }
    public void setData(List<item> itemList){
        this.ItemList = itemList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        item Item = ItemList.get(position);
        holder.imageView.setImageResource(Item.getImage());
        holder.tituloTextView.setText(Item.getTitulo1());
    }

    @Override
    public int getItemCount() {
        return ItemList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tituloTextView;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView= itemView.findViewById(R.id.image_list);
            tituloTextView = itemView.findViewById(R.id.titulo1);
        }
    }
}