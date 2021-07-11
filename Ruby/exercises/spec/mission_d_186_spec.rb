require './app/mission_d_186.rb'

describe '夏日チェック' do
  describe '出力結果のテスト' do
    let(:missionD186) { MissionD186.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "34\n" }
      expect($stdout).to receive(:puts).with('M')
      missionD186.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "35\n" }
      expect($stdout).to receive(:puts).with(35)
      missionD186.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets) { "29\n" }
      expect($stdout).to receive(:puts).with(29)
      missionD186.run
    end
  end
end
