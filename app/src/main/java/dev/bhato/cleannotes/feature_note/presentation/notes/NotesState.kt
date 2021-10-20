package dev.bhato.cleannotes.feature_note.presentation.notes

import dev.bhato.cleannotes.feature_note.domain.model.Note
import dev.bhato.cleannotes.feature_note.domain.util.NoteOrder
import dev.bhato.cleannotes.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)