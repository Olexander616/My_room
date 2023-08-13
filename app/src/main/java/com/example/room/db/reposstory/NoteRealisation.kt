import androidx.lifecycle.LiveData
import com.example.room.db.dao.NoteDao
import com.example.room.db.reposstory.NoteRepository
import com.example.room.model.NoteModel

class NoteRealisation(private val NoteDAo: NoteDao): NoteRepository{

    override val allNotes: LiveData<List<NoteModel>>
        get() = NoteDAo.getAllNotes()

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        NoteDAo.insert(noteModel)
        onSuccess()
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        NoteDAo.delete(noteModel)
        onSuccess()
    }

}