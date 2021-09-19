class Vote < ApplicationRecord
  belongs_to :entry
  belongs_to :member

  validate do
    unless member && member.votable_for?(entry)
      error.add(:base, :invalid)
    end
  end
end
